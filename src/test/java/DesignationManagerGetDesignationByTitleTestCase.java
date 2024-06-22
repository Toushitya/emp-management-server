import com.saturn.machines.hr.bl.interfaces.managers.*;
import com.saturn.machines.hr.bl.exceptions.*;
import com.saturn.machines.hr.bl.interfaces.pojo.*;
import com.saturn.machines.hr.bl.pojo.*;
import com.saturn.machines.hr.bl.managers.*;
import java.util.*;
class DesignationManagerGetDesignationByTitleTestCase
{
public static void main(String arg[])
{
String title = arg[0];
try{
DesignationManagerInterface designationManager;
designationManager = DesignationManager.getDesignationManager();
DesignationInterface dsDesignation = designationManager.getDesignationByTitle(title);
System.out.printf("Title : %s  Code : %d \n",dsDesignation.getTitle(),dsDesignation.getCode());
}catch(BLException blException)
{
if(blException.hasGenericException()) System.out.println(blException.getGenericException());
List<String> properties = blException.getProperties();
for(String property:properties)
{
System.out.println(blException.getException(property));
}
}
}
}
