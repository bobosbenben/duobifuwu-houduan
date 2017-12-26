package com.ynsh.dao;

import com.ynsh.model.MainPageGroupItem;
import com.ynsh.model.Unit;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by syb on 2017/9/20.
 */
@Component
public interface UnitDao {

    Unit selectById(Long id);

    List<Unit> getMainPageGroupItemUnitsList(MainPageGroupItem mainPageGroupItem);

}
