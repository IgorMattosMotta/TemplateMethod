package org.example;

public class PlanoDeSaudePremium extends  PlanoDeSaude{
    @Override
    protected float getDesconto() {
        return 0.30f;
    }
}
