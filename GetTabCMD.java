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
public class GetTabCMD implements Command {
    private Aggregator agg;
    
    public GetTabCMD(Aggregator agg){
        this.agg = agg;
    }
    
    public Object execute(){
        return new Orders(agg.getOrders());
    }
}
