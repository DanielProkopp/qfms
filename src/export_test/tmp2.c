#line 1 "tmp2_actions.rl"
#line 10 "tmp2_actions.rl"



#include <stdio.h>
#include <string.h>


#line 11 "tmp2.c"
static const char _aa1_actions[] = {
	0, 1, 0, 1, 1
};

static const char _aa1_key_offsets[] = {
	0, 2, 2, 4
};

static const char _aa1_trans_keys[] = {
	97, 122, 97, 122, 48, 57, 0
};

static const char _aa1_single_lengths[] = {
	0, 0, 0, 0
};

static const char _aa1_range_lengths[] = {
	1, 0, 1, 1
};

static const char _aa1_index_offsets[] = {
	0, 2, 3, 5
};

static const char _aa1_trans_targs_wi[] = {
	2, 1, 1, 3, 1, 1, 1, 0
};

static const char _aa1_trans_actions_wi[] = {
	3, 3, 3, 3, 3, 1, 3, 0
};

static const int aa1_start = 0;
static const int aa1_first_final = 4;
static const int aa1_error = -1;

static const int aa1_en_main = 0;

#line 17 "tmp2_actions.rl"

int parse(char* string)
{
  int cs;
  char *p, *pe;
  int res=0;

  p = string;
  pe = p + strlen(string);

  
#line 62 "tmp2.c"
	{
	cs = aa1_start;
	}
#line 28 "tmp2_actions.rl"
  
#line 68 "tmp2.c"
	{
	int _klen;
	unsigned int _trans;
	const char *_acts;
	unsigned int _nacts;
	const char *_keys;

	if ( p == pe )
		goto _out;
_resume:
	_keys = _aa1_trans_keys + _aa1_key_offsets[cs];
	_trans = _aa1_index_offsets[cs];

	_klen = _aa1_single_lengths[cs];
	if ( _klen > 0 ) {
		const char *_lower = _keys;
		const char *_mid;
		const char *_upper = _keys + _klen - 1;
		while (1) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( (*p) < *_mid )
				_upper = _mid - 1;
			else if ( (*p) > *_mid )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				goto _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _aa1_range_lengths[cs];
	if ( _klen > 0 ) {
		const char *_lower = _keys;
		const char *_mid;
		const char *_upper = _keys + (_klen<<1) - 2;
		while (1) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( (*p) < _mid[0] )
				_upper = _mid - 2;
			else if ( (*p) > _mid[1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				goto _match;
			}
		}
		_trans += _klen;
	}

_match:
	cs = _aa1_trans_targs_wi[_trans];

	if ( _aa1_trans_actions_wi[_trans] == 0 )
		goto _again;

	_acts = _aa1_actions + _aa1_trans_actions_wi[_trans];
	_nacts = (unsigned int) *_acts++;
	while ( _nacts-- > 0 )
	{
		switch ( *_acts++ )
		{
	case 0:
#line 5 "tmp2_actions.rl"
	{ res = 1; }
	break;
	case 1:
#line 6 "tmp2_actions.rl"
	{ res = 0; }
	break;
#line 147 "tmp2.c"
		}
	}

_again:
	if ( ++p != pe )
		goto _resume;
	_out: {}
	}
#line 29 "tmp2_actions.rl"

  return res;
}

