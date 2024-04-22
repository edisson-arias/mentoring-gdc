namespace FizzBuzz.Parameters
{
    internal class ParametersProcessor : IParametersProcessor
    {
        public int TargetNumber
        {
            get
            {
                Console.WriteLine("Enter target number");
                return int.Parse(Console.ReadLine());
            }
        }
    }
}
