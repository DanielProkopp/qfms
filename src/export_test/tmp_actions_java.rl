public class Machine_klee
{

%%{

machine klee;

action accept { res = 1; }
action not_accept { res = 0; }

include "tmp.rl";

}%%


//#include <stdio.h>
//#include <string.h>

%% write data;

public static int parse(String string)
{
  int cs;
  int pe = string.length();
  int p = 0;

  char data[] = new char[pe];
  
  int res=0;

  for(int i=0; i<pe; i++)
    data[i] = string.charAt(i);

  %% write init;
  %% write exec;

  return res;
}

}

