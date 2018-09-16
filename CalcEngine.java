/* **************************************************************************
*                                                                           *
*                                 CalcEngine                                *
*                                                                           *
****************************************************************************/

public class CalcEngine
{
	public static void main(String[] args)
	{
		/*
		MathEquation testEquation = new MathEquation();
		testEquation.execute();
		System.out.print("test = ");
		System.out.println(testEquation.getResult());
*/
		
		MathEquation[] equations = new MathEquation[4];
		equations[0] = new MathEquation('d', 100, 50);
		equations[1] = new MathEquation('a', 25, 92);
		equations[2] = new MathEquation('s', 225, 17);
		equations[3] = new MathEquation('m', 11, 3);
		
		System.out.println();
		for(MathEquation equation : equations)
		{	
			equation.execute();
			System.out.print("Result = ");
			System.out.println(equation.getResult());
		}
		System.out.println();
	}

	/*
	public static MathEquation create(double leftVal, double rightVal, 
		char opCode)
	{
		MathEquation equation = new MathEquation();
		equation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);
		return equation;
	}
	*/
}

