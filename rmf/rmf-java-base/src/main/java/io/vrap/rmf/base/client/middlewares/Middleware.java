package io.vrap.rmf.base.client.middlewares;

import java.util.concurrent.CompletableFuture;

@Deprecated
@FunctionalInterface
public interface Middleware {

    CompletableFuture<MiddlewareArg> next(MiddlewareArg arg);

}
