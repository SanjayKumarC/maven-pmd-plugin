package test.sub;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

public class MyClass
{
    /**
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        int nullArgs = 0;
        int emptyArgs = 0;
        int notEmptyArgs = 0;
        for ( int i = 0; i < args.length; i++ )
        {
            if( args[i] == null )
            {
                nullArgs++;
                System.out.println( "arg[" + i + "] is null, weird" );
            }
            else if( args[i] == "" )
            {
                emptyArgs++;
                System.out.println( "arg[" + i + "] is empty" );
            }
            else
            {
                notEmptyArgs++;
                System.out.println( "arg[" + i + "] is not empty" );
            }
            System.out.print( "Number of null args: " + nullArgs );
            System.out.print( "Number of empty args: " + emptyArgs );
            System.out.print( "Number of not empty args: " + notEmptyArgs );
        }
    }
}