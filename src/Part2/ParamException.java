package Part2;

/**
 * custom exception
 *
 * @author Xiangnan Liu
 * @date 2023-08-03 19:27
 */
public class ParamException extends RuntimeException {
    public ParamException(String msg) {
        super(msg);
    }
}
