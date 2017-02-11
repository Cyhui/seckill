package org.seckill.exception;

/** 秒杀关闭异常
 * Created by 54459 on 2017/2/6 0006.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
