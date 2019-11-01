package com.zx.demo.mapper;
import com.zx.demo.model.Worker;

import java.util.Date;

public interface
WorkerMapper {
    public int save(Integer id, String name, Integer age, String address, Integer salary, Date date);

    public Worker findById(int id);

    public void update(Integer id, String name, Integer age, String address, Integer salary, Date date);

    public void delete(Integer id);
//
//    public List<User> findUserByUserQueryVo(UserQueryVO vo);
//
//
//    public List<User> findUserByMap(Map<String,Object> map);
//
//
//    /**
//     * 返回用户的个数
//     * @param vo
//     * @return
//     */
//    public int findUserCount(UserQueryVO vo);
//
//
//    public User findUserByIdResultMap(int userId);
//
//    /**
//     * 讲解mybatis的if和where使用
//     * @return
//     */
//    public List<User> findUserList(UserQueryVO vo);
//
//    /*查找多个id的用户数据*/
//    public List<User> findUserByIds(UserQueryVO vo);
//
//    public List<User> findUserByIds2(List<Integer> ids);
//
//
//    /**
//     * 查询用户信息及用户购买的商品信息
//     */
//    public List<User> findUserAndOrderInfo();
//    public User findUserAndOrderInfo(int userId);
}
