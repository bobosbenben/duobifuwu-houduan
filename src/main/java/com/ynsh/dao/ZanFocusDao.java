package com.ynsh.dao;

import com.ynsh.model.Client;
import com.ynsh.model.FocusedUnit;
import com.ynsh.model.Unit;
import com.ynsh.model.ZanedUnit;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by syb on 2017/10/14.
 */

@Component
public interface ZanFocusDao {

    public void zanUnit(ZanedUnit zanedUnit);

    public void reZanUnit(ZanedUnit zanedUnit);

    public void deleteZanUnit(ZanedUnit zanedUnit);

    public void focusUnit(FocusedUnit focusedUnit);

    public void reFocusUnit(FocusedUnit focusedUnit);

    public void deleteFocusUnit(FocusedUnit focusedUnit);

    public ZanedUnit getZanedUnit(ZanedUnit zanedUnit);

    public FocusedUnit getFocusedUnit(FocusedUnit focusedUnit);

    public List<Unit> getSingleClientZanedUnits(Client client);

    public List<Unit> getSingleClientFocusedUnits(Client client);

    public void addZanedTimes(ZanedUnit zanedUnit);

    public void reduceZanedTimes(ZanedUnit zanedUnit);

    public void addFocusedTimes(FocusedUnit focusedUnit);

    public void reduceFocusedTimes(FocusedUnit focusedUnit);

}
