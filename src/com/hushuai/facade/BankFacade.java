package com.hushuai.facade;

/**
 * 银行接待员，就相当于门面，用户去银行办理业务，只需要跟接待员交代自己要办理的业务，剩下的是接待员来协调内部各个子系统，来完成功能，
 * 不需要用户自己去协调实现功能的所有角色
 * created by it_hushuai
 * 2020/12/20 13:58
 */
public class BankFacade {
    private CashStaff cashStaff; // 现金业务办理员
    private CreditStaff creditStaff; // 贷款业务办理员
    private FundStaff fundStaff; // 基金业务办理员

    // 各个子系统需要在内部实现，内部管理
    public BankFacade() {
        this.cashStaff = new CashStaff();
        this.creditStaff = new CreditStaff();
        this.fundStaff = new FundStaff();
    }

    // 对外接口：每个功能接口可能需要多种子系统（角色的相互配合，案例中简化了，每种功能只有一个系统来完成）
    // 接待用户办理现金业务
    public void cash() {
        cashStaff.cash();
    }

    // 接待用户办理贷款业务
    public void credit() {
        creditStaff.credit();
    }
    // 接待用户办理基金业务
    public void fund() {
        fundStaff.fund();
    }
}

class CashStaff {
    public void cash() {
        System.out.println("我是现金业务办理员，可以帮您存钱取钱");
    }
}

class CreditStaff {
    public void credit() {
        System.out.println("我是信用业务办理员，可以帮您贷款");
    }
}

class FundStaff {
    public void fund() {
        System.out.println("我是基金业务办理员，可以帮您办理基金业务");
    }
}