
public class Manager extends Employee{

	public Manager(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public void assignBug(Bug bug, int developerID) {
		bug.setDeveloperID(developerID);
		bug.setStatus(STATUS.ASSIGNED);
	}
	public void displayBugDetails(Bug bug) {
		System.out.println("[Bug id= "+bug.getBugID()+" Developer id= "+bug.getDeveloperID()+" Tester id= "+bug.getTesterID()+" and Bug Status= "+bug.getStatus()+"]");
	}
	@Override
	public String toString() {
		return "Id is: "+this.getId()+" and name is: "+this.getName();
		
	}
}
 
