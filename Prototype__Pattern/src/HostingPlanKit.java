public class HostingPlanKit {
    private HostingPlan basicPlan;
    private HostingPlan premiumPlan;
    private HostingPlan premPlusPlan;


    public HostingPlanKit(HostingPlan basic, HostingPlan premiumPlan, HostingPlan premPlusPlan)
    {
        basicPlan = basic;
        premiumPlan = premiumPlan;
        premPlusPlan = premPlusPlan;
    }

    public HostingPlan getBasicPlan()
    {
        return (HostingPlan) basicPlan.clone();
    }

    public HostingPlan getPremiumPlan()
    {
        return (HostingPlan) premiumPlan.clone();
    }

    public HostingPlan getPremPlusPlan()
    {
        return (HostingPlan) premPlusPlan.clone();
    }


}
