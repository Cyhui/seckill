package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by 54459 on 2017/2/6 0006.
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
