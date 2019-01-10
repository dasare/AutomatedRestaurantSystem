/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;
import Aggregator.*;

/**
 *
 * @author dasare
 */
public class CMDGetMenu implements Command {

    private Aggregator agg;

    public CMDGetMenu(Aggregator agg) {
        this.agg = agg;
    }

    public Object execute() {
        return new Menu(agg.getMenu()); // if copy constructor implemented
        // or
        //return agg.getMenu().clone(); // if clone method implemented 
    }
}
