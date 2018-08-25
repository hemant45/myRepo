    package com.practice.random;

    class ExceptionHandlingNesting
    {   int count = 0;

        void A() throws Exception
        {
            try
            {
                count++;
                    System.out.println("First");
                try
                {
                    count++;
                    System.out.println("Second");
                                try
                                {
                                    count++;
                                    System.out.println("Third");
                                    throw new Exception();

                                }

                                catch(Exception ex)
                                {
                                    count++;
                                    System.out.println("Fourth");
                                   //  throw new Exception();
                                }
                }

                catch(Exception ex)
                {
                    System.out.println("Fifth");
                    count++;
                }
            }
            catch(Exception ex)
            {
                System.out.println("Sizth");
                count++;
            }

        }

        void display()
        {
            System.out.println(count);
        }

        public static void main(String[] args) throws Exception
        {
            ExceptionHandlingNesting obj = new ExceptionHandlingNesting();
            obj.A();
            obj.display();
        }
    }
