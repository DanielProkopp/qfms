%%{

machine asdfsd;

action accept { res = 1; }
action not_accept { res = 0; }

include "tmp.rl";

}%%


#include <stdio.h>
#include <string.h>

%% write data;

int parse(char* string)
{
  int cs;
  int res=0;
  char *p, *pe;

  p = string;
  pe = p + strlen(string);

  %% write init;
  %% write exec;

  return res;
}

