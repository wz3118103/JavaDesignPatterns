package com.enjoy.dp.Memento.example3;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 21:47 2018/10/8
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class AddCommand extends AbstractCommand{

    private int opeNum;
    public AddCommand(int opeNum){
        this.opeNum = opeNum;
    }

    public void execute() {
        this.operation.add(opeNum);
    }
}
