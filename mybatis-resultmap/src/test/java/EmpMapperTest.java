import com.canyan7n.mybatis.mapper.DeptMapper;
import com.canyan7n.mybatis.mapper.EmpMapper;
import com.canyan7n.mybatis.pojo.Dept;
import com.canyan7n.mybatis.pojo.Emp;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :EmpMapperTest
 * @date ：2023/3/19 12:03
 * @description：TODO
 */
public class EmpMapperTest {

    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptById(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpandDeptByStepOne(2);
        System.out.println(emp.getEmpName());
    }


}
