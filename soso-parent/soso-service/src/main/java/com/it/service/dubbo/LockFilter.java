package com.it.service.dubbo;

import com.alibaba.dubbo.rpc.*;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

import java.util.Arrays;

/**
 * Created by hebaceous on 2017/5/2.
 *
 * @author hebaceous
 */
public class LockFilter implements Filter {

    private CuratorFramework curatorFramework;

    public void setCuratorFramework(CuratorFramework curatorFramework) {
        this.curatorFramework = curatorFramework;
    }

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String key = "/fayuan/locks/" + invoker.getInterface().getSimpleName() + "." + invocation.getMethodName() + "-" + Arrays.toString(invocation.getArguments()).replaceAll("/", "_").replaceAll(" ", "");
        InterProcessLock interProcessLock = new InterProcessMutex(curatorFramework, key);
        try {
            interProcessLock.acquire();
            return invoker.invoke(invocation);
        } catch (Exception e) {
            throw new RpcException(e);
        } finally {
            try {
                interProcessLock.release();
            } catch (Exception e) {
                throw new RpcException(e);
            }
        }
    }

}
