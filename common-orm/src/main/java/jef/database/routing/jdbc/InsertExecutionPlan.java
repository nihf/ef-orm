package jef.database.routing.jdbc;

import jef.database.Session;
import jef.database.annotation.PartitionResult;
import jef.database.jsqlparser.statement.insert.Insert;

public class InsertExecutionPlan implements ExecutionPlan{

	public InsertExecutionPlan(PartitionResult[] results, StatementContext<Insert> context) {
		// TODO Auto-generated constructor stub
	}

	public boolean isMultiDatabase() {
		// TODO Auto-generated method stub
		return false;
	}

	public PartitionResult[] getSites() {
		// TODO Auto-generated method stub
		return null;
	}

	public int processUpdate(PartitionResult site, Session session) {
		// TODO Auto-generated method stub
		return 0;
	}

}
