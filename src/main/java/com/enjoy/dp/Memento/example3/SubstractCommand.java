package com.enjoy.dp.Memento.example3;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 21:48 2018/10/8
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class SubstractCommand extends AbstractCommand{

    private int opeNum;
    public SubstractCommand(int opeNum){
        this.opeNum = opeNum;
    }
    public void execute() {
        this.operation.substract(opeNum);
    }

}
