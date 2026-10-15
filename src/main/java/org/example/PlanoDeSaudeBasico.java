package org.example;

public class PlanoDeSaudeBasico extends  PlanoDeSaude{
    @Override
    protected float getDesconto() {
        return 0.10f;
    }
}
