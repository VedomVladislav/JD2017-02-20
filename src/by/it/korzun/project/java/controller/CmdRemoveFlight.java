package by.it.korzun.project.java.controller;

import by.it.korzun.project.java.beans.Flight;
import by.it.korzun.project.java.dao.DAO;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.text.ParseException;

public class CmdRemoveFlight extends Action{
    @Override
    Action execute(HttpServletRequest request) {
        try {
            DAO dao = DAO.getInstance();
            Flight flight = dao.flight.read(Integer.parseInt(Form.getString(request, "removeflight", Pattern.SPECIALIZATION)));

            if(dao.flight.delete(flight)){
                return null;
            }else
                return null;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
