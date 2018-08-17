#line 1 "tmp_actions.rl"
#line 10 "tmp_actions.rl"



#include <stdio.h>
#include <string.h>


#line 11 "tmp.c"
static const char _asdfsd_actions[] = {
	0, 1, 0
};

static const char _asdfsd_key_offsets[] = {
	0, 0, 3
};

static const char _asdfsd_trans_keys[] = {
	91, 93, 97, 0
};

static const char _asdfsd_single_lengths[] = {
	0, 3, 0
};

static const char _asdfsd_range_lengths[] = {
	0, 0, 0
};

static const char _asdfsd_index_offsets[] = {
	0, 0, 4
};

static const char _asdfsd_indicies[] = {
	0, 0, 0, 1, 1, 0
};

static const char _asdfsd_trans_targs_wi[] = {
	2, 0
};

static const char _asdfsd_trans_actions_wi[] = {
	1, 0
};

static const int asdfsd_start = 1;
static const int asdfsd_first_final = 2;
static const int asdfsd_error = 0;

static const int asdfsd_en_main = 1;

#line 17 "tmp_actions.rl"

int parse(char* string)
{
  int cs;
  int res=0;
  char *p, *pe;

  p = string;
  pe = p + strlen(string);

  
#line 66 "tmp.c"
	{
	cs = asdfsd_start;
	}
#line 28 "tmp_actions.rl"
  
#line 72 "tmp.c"
	{
	int _klen;
	unsigned int _trans;
	const char *_acts;
	unsigned int _nacts;
	const char *_keys;

	if ( p == pe )
		goto _out;
	if ( cs == 0 )
		goto _out;
_resume:
	_keys = _asdfsd_trans_keys + _asdfsd_key_offsets[cs];
	_trans = _asdfsd_index_offsets[cs];

	_klen = _asdfsd_single_lengths[cs];
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

	_klen = _asdfsd_range_lengths[cs];
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
	_trans = _asdfsd_indicies[_trans];
	cs = _asdfsd_trans_targs_wi[_trans];

	if ( _asdfsd_trans_actions_wi[_trans] == 0 )
		goto _again;

	_acts = _asdfsd_actions + _asdfsd_trans_actions_wi[_trans];
	_nacts = (unsigned int) *_acts++;
	while ( _nacts-- > 0 )
	{
		switch ( *_acts++ )
		{
	case 0:
#line 5 "tmp_actions.rl"
	{ res = 1; }
	break;
#line 150 "tmp.c"
		}
	}

_again:
	if ( cs == 0 )
		goto _out;
	if ( ++p != pe )
		goto _resume;
	_out: {}
	}
#line 29 "tmp_actions.rl"

  return res;
}

