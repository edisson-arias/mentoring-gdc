namespace FizzBuzz.Parameters
{

    internal class FizzAndBuzzParameters
    {
        public FizzAndBuzzParameters()
        {
            FizzNumber = 3;
            BuzzNumber = 5;
            FizzString = "Fizz";
            BuzzString = "Buzz";
        }
        public int FizzNumber { get; set; }
        public int BuzzNumber { get; set; }
        public string FizzString { get; set; }
        public string BuzzString { get; set; }
    }
}
