%%{

machine aa1;

action accept { res = 1; }
action not_accept { res = 0; }

include "tmp2.rl";

}%%


#include <stdio.h>
#include <string.h>

%% write data;

int parse(char* string)
{
  int cs;
  char *p, *pe;
  int res=0;

  p = string;
  pe = p + strlen(string);

  %% write init;
  %% write exec;

  return res;
}

