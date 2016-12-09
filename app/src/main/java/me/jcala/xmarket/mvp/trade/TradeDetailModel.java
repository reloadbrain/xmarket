package me.jcala.xmarket.mvp.trade;

import me.jcala.xmarket.data.dto.Result;
import me.jcala.xmarket.data.pojo.Message;
import me.jcala.xmarket.data.pojo.Trade;

public interface TradeDetailModel {

    interface onDetailListener{

        void onGainDealComplete(Result<Trade> result);

        void onBuyComplete(Result<Message> result);

    }

    void executeDetailReq(onDetailListener listener,String tradeId);

    void executeBuyReq(onDetailListener listener,String userId,String tradeId);

}
