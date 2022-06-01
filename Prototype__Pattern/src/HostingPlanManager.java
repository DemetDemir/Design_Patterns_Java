public class HostingPlanManager {

    public static HostingPlanKit getHostingPlanKit(String platform)
    {
        HostingPlan basicPlan = null;
        HostingPlan premiumPlan = null;
        HostingPlan premPlusPlan = null;

        if(platform.equalsIgnoreCase("Win"))
        {
            basicPlan = new Winbasic();
            premiumPlan = new WinPremium();
            premPlusPlan = new WinPremPlus();
        }

        if(platform.equalsIgnoreCase("Unix"))
        {
            basicPlan = new Unixbasic();
            premiumPlan = new UnixPremium();
            premPlusPlan = new UnixPremPlus();
        }

        return new HostingPlanKit (basicPlan, premiumPlan, premPlusPlan);
    }
}
