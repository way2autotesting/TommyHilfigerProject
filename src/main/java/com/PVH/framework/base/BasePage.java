package com.PVH.framework.base;

/**
 * Created by Ibi on 31/05/2021.
 */
public abstract class BasePage extends Base{

    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance)
    {
        try
        {
            return (TPage)this;
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

        return null;
    }
}
