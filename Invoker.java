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
public class Invoker {

    private Aggregator agg;

    public Menu getMenu() {
        return (Menu) new CMDGetMenu(agg).execute();

    }

    public Tab getTab() {
        return (Tab) new GetTabCMD(agg).execute();
    }

    public Orders getOrder() {
        return (Orders) new SubmitOrderCMD(agg).execute();
    }

    public Invoker(Aggregator agg) {
        this.agg = agg;
    }

}
