// line 1 "tmp_actions_java.rl"
public class Machine_klee
{

// line 13 "tmp_actions_java.rl"



//#include <stdio.h>
//#include <string.h>


// line 14 "Machine_klee.java"
private static void init__klee_actions_0( byte[] r )
{
	r[0]=0; r[1]=1; r[2]=0; r[3]=1; r[4]=1; 
}

private static byte[] create__klee_actions( )
{
	byte[] r = new byte[5];
	init__klee_actions_0( r );
	return r;
}

private static final byte _klee_actions[] = create__klee_actions();


private static void init__klee_key_offsets_0( byte[] r )
{
	r[0]=0; r[1]=0; r[2]=9; r[3]=16; r[4]=18; 
}

private static byte[] create__klee_key_offsets( )
{
	byte[] r = new byte[5];
	init__klee_key_offsets_0( r );
	return r;
}

private static final byte _klee_key_offsets[] = create__klee_key_offsets();


private static void init__klee_trans_keys_0( char[] r )
{
	r[0]=43; r[1]=45; r[2]=46; r[3]=0; r[4]=47; r[5]=48; r[6]=57; r[7]=58; 
	r[8]=255; r[9]=46; r[10]=0; r[11]=47; r[12]=48; r[13]=57; r[14]=58; r[15]=255; 
	r[16]=48; r[17]=57; r[18]=0; 
}

private static char[] create__klee_trans_keys( )
{
	char[] r = new char[19];
	init__klee_trans_keys_0( r );
	return r;
}

private static final char _klee_trans_keys[] = create__klee_trans_keys();


private static void init__klee_single_lengths_0( byte[] r )
{
	r[0]=0; r[1]=3; r[2]=1; r[3]=0; r[4]=0; 
}

private static byte[] create__klee_single_lengths( )
{
	byte[] r = new byte[5];
	init__klee_single_lengths_0( r );
	return r;
}

private static final byte _klee_single_lengths[] = create__klee_single_lengths();


private static void init__klee_range_lengths_0( byte[] r )
{
	r[0]=0; r[1]=3; r[2]=3; r[3]=1; r[4]=0; 
}

private static byte[] create__klee_range_lengths( )
{
	byte[] r = new byte[5];
	init__klee_range_lengths_0( r );
	return r;
}

private static final byte _klee_range_lengths[] = create__klee_range_lengths();


private static void init__klee_index_offsets_0( byte[] r )
{
	r[0]=0; r[1]=0; r[2]=7; r[3]=12; r[4]=14; 
}

private static byte[] create__klee_index_offsets( )
{
	byte[] r = new byte[5];
	init__klee_index_offsets_0( r );
	return r;
}

private static final byte _klee_index_offsets[] = create__klee_index_offsets();


private static void init__klee_indicies_0( byte[] r )
{
	r[0]=1; r[1]=1; r[2]=2; r[3]=0; r[4]=3; r[5]=0; r[6]=4; r[7]=2; 
	r[8]=0; r[9]=3; r[10]=0; r[11]=4; r[12]=5; r[13]=0; r[14]=4; r[15]=0; 
}

private static byte[] create__klee_indicies( )
{
	byte[] r = new byte[16];
	init__klee_indicies_0( r );
	return r;
}

private static final byte _klee_indicies[] = create__klee_indicies();


private static void init__klee_trans_targs_wi_0( byte[] r )
{
	r[0]=4; r[1]=2; r[2]=3; r[3]=2; r[4]=0; r[5]=3; 
}

private static byte[] create__klee_trans_targs_wi( )
{
	byte[] r = new byte[6];
	init__klee_trans_targs_wi_0( r );
	return r;
}

private static final byte _klee_trans_targs_wi[] = create__klee_trans_targs_wi();


private static void init__klee_trans_actions_wi_0( byte[] r )
{
	r[0]=3; r[1]=3; r[2]=3; r[3]=1; r[4]=0; r[5]=1; 
}

private static byte[] create__klee_trans_actions_wi( )
{
	byte[] r = new byte[6];
	init__klee_trans_actions_wi_0( r );
	return r;
}

private static final byte _klee_trans_actions_wi[] = create__klee_trans_actions_wi();


static final int klee_start = 1;
static final int klee_first_final = 4;
static final int klee_error = 0;

static final int klee_en_main = 1;

// line 20 "tmp_actions_java.rl"

public static int parse(String string)
{
  int cs;
  int pe = string.length();
  int p = 0;

  char data[] = new char[pe];
  
  int res=0;

  for(int i=0; i<pe; i++)
    data[i] = string.charAt(i);

  
// line 175 "Machine_klee.java"
	{
	cs = klee_start;
	}
// line 35 "tmp_actions_java.rl"
  
// line 181 "Machine_klee.java"
	{
	int _klen;
	int _trans;
	int _acts;
	int _nacts;
	int _keys;

	if ( p != pe ) {
	if ( cs != 0 ) {
	_resume: while ( true ) {
	_again: do {
	_match: do {
	_keys = _klee_key_offsets[cs];
	_trans = _klee_index_offsets[cs];
	_klen = _klee_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _klee_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _klee_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _klee_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _klee_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _klee_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _klee_indicies[_trans];
	cs = _klee_trans_targs_wi[_trans];

	if ( _klee_trans_actions_wi[_trans] == 0 )
		break _again;

	_acts = _klee_trans_actions_wi[_trans];
	_nacts = (int) _klee_actions[_acts++];
	while ( _nacts-- > 0 )
	{
		switch ( _klee_actions[_acts++] )
		{
	case 0:
// line 8 "tmp_actions_java.rl"
	{ res = 1; }
	break;
	case 1:
// line 9 "tmp_actions_java.rl"
	{ res = 0; }
	break;
// line 262 "Machine_klee.java"
		}
	}

	} while (false);
	if ( cs == 0 )
		break _resume;
	if ( ++p == pe )
		break _resume;
	}
	}	}
	}
// line 36 "tmp_actions_java.rl"

  return res;
}

}

