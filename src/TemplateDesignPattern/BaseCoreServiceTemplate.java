package TemplateDesignPattern;

public class BaseCoreServiceTemplate {

    private  <T extends BaseBizRequest, R extends BaseBizResponse> R execute(
            final T request,
            BaseProcessor processor,
            boolean isTx){
        processor.bizPreProcess();
        processor.bizProcess();
        processor.bizPostProcess();
    }
    public <T extends BaseBizRequest, R extends BaseBizResponse> R executeTx(T bizRequest,BaseProcessor<T,R> processor){
        return this.execute(bizRequest,processor,true);
    }

    public <T extends BaseBizRequest, R extends BaseBizResponse> R executeNonTx(T bizRequest){
        return this.execute(bizRequest,false);
    }

}
