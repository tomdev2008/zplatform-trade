/* 
 * UpdateData.java  
 * 
 * version TODO
 *
 * 2016年3月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.bean;

/**
 * Class Description
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月16日 上午11:09:54
 * @since 
 */
public class UpdateData {
    public String txnSeqNo;
    public String resultCode;
    public String resultMessage;

    public String getTxnSeqNo() {
        return txnSeqNo;
    }
    public void setTxnSeqNo(String txnSeqNo) {
        this.txnSeqNo = txnSeqNo;
    }
    public String getResultCode() {
        return resultCode;
    }
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    public String getResultMessage() {
        return resultMessage;
    }
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}