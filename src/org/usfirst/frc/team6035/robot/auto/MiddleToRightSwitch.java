package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class MiddleToRightSwitch extends AutoDirection{
	
	public MiddleToRightSwitch() {
		super(Config.MIDDLE_TO_RIGHT_SWITCH_SPEED_COMPENSATION);	
	}

	private double[] leftMotorSpeeds = {
			0.0, 
			1.8291390908262777, 
			2.8527093912616968, 
			3.431861001054953, 
			3.7596106136716005, 
			3.9451314378817073, 
			4.050228568424624, 
			4.109812237287678, 
			4.143703100559081, 
			4.163003263867263, 
			4.174110476679024, 
			4.180436737979747, 
			4.184122691705957, 
			4.186045848755, 
			4.18719021178542, 
			4.1878200154779375, 
			4.188407085805016, 
			4.188942256686095, 
			4.189719315265532, 
			4.19056269843386, 
			4.191741546456533, 
			4.1928681219566935, 
			4.194260911792121, 
			4.195169569003915, 
			4.196093503920043, 
			4.195854824347263, 
			4.1959009856298275, 
			4.195785355296629, 
			4.196637290047541, 
			4.197920766489372, 
			4.20059449597567, 
			4.203771316333923, 
			4.2084869438383254, 
			4.213088732839986, 
			4.218873401632549, 
			4.2227211807599145, 
			4.226692122759642, 
			4.225889619434348, 
			4.2263166529209695, 
			4.226126109275824, 
			4.230040775231188, 
			4.235870962819164, 
			4.247673403044613, 
			4.261825976545813, 
			4.282760608101052, 
			4.303663498465503, 
			4.33010236952501, 
			4.3489857090942206, 
			4.369072012617542, 
			4.3693834437580525, 
			4.3756181991713605, 
			4.380001736927252, 
			4.40338239964578, 
			4.436907197853468, 
			4.4992238760375, 
			4.575604197299659, 
			4.687075759224564, 
			4.804628123082425, 
			4.954593482637934, 
			5.0771152066362655, 
			5.211598216243424, 
			5.254652944939748, 
			5.326211179089028, 
			5.387155828533298, 
			5.537940350216018, 
			5.734894406690126, 
			6.064642770941475, 
			6.448157964108454, 
			6.969594648599308, 
			7.461853912882258, 
			8.008754064239222, 
			8.28789190403003, 
			8.442755740408995, 
			8.058520955648648, 
			7.629396590590465, 
			7.0780556421558405, 
			6.645654747693546, 
			6.257079568034269, 
			6.000093844120839, 
			5.805692340726487, 
			5.709027810650635, 
			5.651618924510868, 
			5.653467126904328, 
			5.6550260906806376, 
			5.675567847220745, 
			5.647404010421417, 
			5.623637094887716, 
			5.582007961399771, 
			5.553196862031188, 
			5.523447523430537, 
			5.508114388930303, 
			5.496952693897212, 
			5.498180563488925, 
			5.502906394192229, 
			5.516152283755507, 
			5.527640970751236, 
			5.541332007464742, 
			5.543958504093407, 
			5.545618788879001, 
			5.541793459207679, 
			5.538948586474988, 
			5.534465443318204, 
			5.5318050145517415, 
			5.529045883488024, 
			5.528021370514581, 
			5.527086947109013, 
			5.527256304639337, 
			5.526718742339537, 
			5.5261352983716625, 
			5.5232627719290655, 
			5.5196306344187835, 
			5.514425341304398, 
			5.508382685537712, 
			5.501039826532676, 
			5.492402638145325, 
			5.482299671290707, 
			5.4702400635762665, 
			5.456606046575259, 
			5.440626758328409, 
			5.423786113986663, 
			5.405081938576419, 
			5.387482995223245, 
			5.3679643302021365, 
			5.347363954650678, 
			5.322424103121692, 
			5.293613755975438, 
			5.257309458702979, 
			5.2146050029429425, 
			5.161241431119775, 
			5.1006375795761825, 
			5.028078863274618, 
			4.952602930909029, 
			4.868834561162982, 
			4.7941842981717215, 
			4.71202683199203, 
			4.627709971261831, 
			4.5239256768495055, 
			4.40369208433061, 
			4.248494041774722, 
			4.0644182625336285, 
			3.830252373172763, 
			3.5658148639114144, 
			3.24974693559402, 
			2.9420147009947364, 
			2.626105511900102, 
			2.4393153551381475, 
			2.2946327742731376, 
			2.248318907671716, 
			2.2173417062215637, 
			2.231193224850172, 
			2.229728978185497, 
			2.236792698631465, 
			2.213105184275234, 
			2.1869365442919753, 
			2.132662732828089, 
			2.0937982751714377, 
			2.0501538218592708, 
			2.06821560263747, 
			2.093115506549046, 
			2.1484152578577635, 
			2.1951883876470837, 
			2.2479086822174073, 
			2.2842067049038084, 
			2.3162136599035223, 
			2.3313519473755666, 
			2.341811311057084, 
			2.3398368982469977, 
			2.3408500334905575, 
			2.338305044997684, 
			2.3528082121040717, 
			2.3669367116376634, 
			2.387840193290306, 
			2.403996119343377, 
			2.420082621209369, 
			2.4296453077475366, 
			2.436775022005418, 
			2.437628605828891, 
			2.436599339744318, 
			2.430924238580485, 
			2.4266349753089917, 
			2.4208301470076354, 
			2.4219379760136515, 
			2.4218774202591073, 
			2.423605883005477, 
			2.4212275886039754, 
			2.4171509476403226, 
			2.4070907933315584, 
			2.394118562806002, 
			2.374361251906109, 
			2.3529412645091217, 
			2.325668849364893, 
			2.302065300737509, 
			2.276259101659019, 
			2.2634100093171496, 
			2.246405478055096, 
			2.2306719783025106, 
			2.202212456246211, 
			2.166630801545047, 
			2.111620312929629, 
			2.046428258627083, 
			1.957861472612766, 
			1.8642637752868505, 
			1.7501268532362804, 
			1.6526018371092106, 
			1.5493701177266246, 
			1.5021432443065788, 
			1.443195356983948, 
			1.3961061128818377, 
			1.3073420195931482, 
			1.2048376908331386, 
			1.0484306557071226, 
			0.891573195893577, 
			0.7089579797529312, 
			0.6205800426617101, 
			0.6416321287599335, 
			0.687607883379732, 
			0.7850704922955044, 
			0.6790446392030032, 
			0.6607568827977222, 
			0.7457922642479716, 
			0.901946910192888, 
			1.1229120250118185, 
			1.3053083696022556, 
			1.4766767835054202, 
			1.592947799914726, 
			1.692240336571063, 
			1.7518279494181306, 
			1.8194428963375036, 
			1.8750812214615677, 
			1.9769443585077124, 
			2.071798511173959, 
			2.1787628760849427, 
			2.266427309686754, 
			2.3482666525127858, 
			2.409119065297978, 
			2.4604022067096802, 
			2.494654466826042, 
			2.5223371428987584, 
			2.5390036610956748, 
			2.556259742843363, 
			2.5697700718351046, 
			2.5934613989530453, 
			2.6150863455258975, 
			2.639404019274371, 
			2.6588335660528255, 
			2.676708396583416, 
			2.6890965920339664, 
			2.6989262405931838, 
			2.7040100959764137, 
			2.70732042563667, 
			2.7073175239926126, 
			2.7077894858407374, 
			2.7070373860969696, 
			2.710093018394244, 
			2.71210576478198, 
			2.7148176025171256, 
			2.714773636837267, 
			2.7133789911638, 
			2.7081878512752393, 
			2.700930297977441, 
			2.6894357524420256, 
			2.6765167552409594, 
			2.659861111421535, 
			2.644680355733602, 
			2.6278086675980172, 
			2.6175879272706197, 
			2.6047726252096655, 
			2.592270827759673, 
			2.57234258838649, 
			2.5478132976296783, 
			2.511692829445607, 
			2.468645184560061, 
			2.4110512917732962, 
			2.3484774315883565, 
			2.27198632722418, 
			2.201709574688045, 
			2.1251838490615054, 
			2.076990263588624, 
			2.0191886212318373, 
			1.9640723396197668, 
			1.8788981879028348, 
			1.7759428076924888, 
			1.6257671664729565, 
			1.4507312127856278, 
			1.221415398375527, 
			0.9898247003456211, 
			0.7313245557372349, 
			0.5706163293299545, 
			0.49608633524141665, 
			0.3979606134516651, 
			0.4079898530680549, 
			0.4891749724642703, 
			0.5959912380194607, 
			0.7511904514697615, 
			0.870578229892481, 
			0.9849959267873107, 
			1.0501878532261708, 
			1.1035550124642541, 
			1.1192321520164477, 
			1.1473939424274653, 
			1.1660803053719233, 
			1.2423033718426875, 
			1.3169909252290097, 
			1.412721239875477, 
			1.4919021624643567, 
			1.5695831849651452, 
			1.626238353265819, 
			1.6745951548882139, 
			1.7044773220570768, 
			1.727951662897714, 
			1.7388939401813555, 
			1.7513780502065208, 
			1.7598696852908071, 
			1.782008679957186, 
			1.802621359278489, 
			1.827767215509804, 
			1.847828889170037, 
			1.8668934932188583, 
			1.8798585862600932, 
			1.8902453020984848, 
			1.895200333492846, 
			1.8982745320089272, 
			1.897519912377545, 
			1.8974628843082226, 
			1.896085768051346, 
			1.8994274261355308, 
			1.901828445446802, 
			1.9053869894123732, 
			1.9061200488469012, 
			1.9056613336049608, 
			1.901283914226187, 
			1.8949116672325685, 
			1.8842264681054854, 
			1.872231267304861, 
			1.856519540282991, 
			1.842523679622635, 
			1.8269668459163135, 
			1.8184553798091567, 
			1.8074451284049922, 
			1.7969650203225134, 
			1.7791329817259622, 
			1.756925611693036, 
			1.7233324948221451, 
			1.6832068303815975, 
			1.628965046393462, 
			1.5703938094958774, 
			1.4985832282715321, 
			1.4339091270803175, 
			1.3638611036992756, 
			1.323331430586583, 
			1.2743177728472068, 
			1.229956098718232, 
			1.1586963623566293, 
			1.0754420081730125, 
			0.9549437159004984, 
			0.8272128309560028, 
			0.6757257586397963, 
			0.5754643817485408, 
			0.5415915387166105, 
			0.5920171830899567, 
			0.7066797593778209, 
			0.65165068911677, 
			0.5873566449660764, 
			0.44882118724170617, 
			0.3793395573098432, 
			0.3710003714432081, 
			0.399302532037067, 
			0.46339442159175287, 
			0.5011449635763157, 
			0.5399152115385738, 
			0.5481787534574364, 
			0.5729005139122199, 
			0.5903194893400232, 
			0.666325479637883, 
			0.7413282607492846, 
			0.8375718382439873, 
			0.917391302821634, 
			0.9957422525111402, 
			1.0531615302417972, 
			1.1023174575199686, 
			1.1331377546152277, 
			1.1575723604172459, 
			1.169621045229687, 
			1.1831011299789662, 
			1.192647375276441, 
			1.2154612790561783, 
			1.2368629078479436, 
			1.2627560566609144, 
			1.28394654035876, 
			1.304362900412966, 
			1.3192871525539984, 
			1.3319704484004982, 
			1.3399765006574509, 
			1.3463106670315543, 
			1.3495176705401277, 
			1.353020963804435, 
			1.3555108622670802, 
			1.361216867276567, 
			1.3665455170410532, 
			1.3729523102591046, 
			1.378189486345372, 
			1.3832251379083784, 
			1.3869070931674055, 
			1.3900344999190266, 
			1.3920129511333, 
			1.3935790271413109, 
			1.3943779480990504, 
			1.3952464381830256, 
			1.395865330506483, 
			1.3972665541638642, 
			1.3985742068032865, 
			1.4001428513306822, 
			1.4014243117576604, 
			1.4026521594019052, 
			1.4035431331291783, 
			1.4042837608123107, 
			1.4047188754268851, 
			1.4050027063870942, 
			1.405012640835216, 
			1.4048766491836737, 
			1.404399339512481, 
			1.4036049542686782, 
			1.4019115833061597, 
			1.3987264644663948, 
			1.3927337905662842, 
			1.381876575890118, 
			1.362367435233499, 
			1.3276537671940734, 
			1.2660601231136106, 
			1.1570185612023072, 
			0.9641180444922087, 
			0.6230285242965494, 
			0.0, 
	};
	
	private double[] rightMotorSpeeds = {
			0.0, 
			1.8288167085237303, 
			2.8520402589530462, 
			3.4308144029852734, 
			3.7581096966892527, 
			3.943118207458927, 
			4.047572226535701, 
			4.106445628908233, 
			4.1394545291987885, 
			4.15785607394484, 
			4.1679071060130894, 
			4.17334562170881, 
			4.176092117289523, 
			4.1775574801493836, 
			4.178084237354571, 
			4.17813167904278, 
			4.177645169936108, 
			4.176838074762911, 
			4.17553276907824, 
			4.173933985024741, 
			4.171792883421566, 
			4.1694668805303605, 
			4.166643207467441, 
			4.1640328592940365, 
			4.161184657261531, 
			4.159263820283786, 
			4.1569545127213425, 
			4.154663046717496, 
			4.151272413104964, 
			4.14719220007146, 
			4.141396225659605, 
			4.134582504143028, 
			4.125625070811455, 
			4.115954776000765, 
			4.104244300760268, 
			4.093423751187656, 
			4.08161464179631, 
			4.073655725122636, 
			4.0640763253084415, 
			4.0545619679691765, 
			4.040444052300861, 
			4.023410206582455, 
			3.999143689274609, 
			3.9705248558986432, 
			3.9327844895213153, 
			3.8918852535941713, 
			3.842182016197008, 
			3.796073085051363, 
			3.7455840128456397, 
			3.711546742549899, 
			3.670418717557877, 
			3.6294517048573627, 
			3.5681325111126356, 
			3.493600031391308, 
			3.386502886730582, 
			3.259231142235857, 
			3.0901236430041883, 
			2.90601128335393, 
			2.681553343277878, 
			2.4760040420286322, 
			2.2550689169447624, 
			2.125072473533024, 
			1.9775900968257722, 
			1.857566485933174, 
			1.677405043784982, 
			1.4967344745558, 
			1.2619483448825917, 
			1.106737384345845, 
			1.0484841048158473, 
			1.2257937322836496, 
			1.6018610607060049, 
			1.791431376503026, 
			1.9217374445701005, 
			1.6075022606458176, 
			1.4564408645686475, 
			1.574689207019187, 
			1.8723716641961445, 
			2.287893106989141, 
			2.648383011353065, 
			2.984761991726181, 
			3.237021823887491, 
			3.458123353662777, 
			3.6217546270897576, 
			3.789918706665021, 
			3.93796244071167, 
			4.133759017101435, 
			4.311311651510405, 
			4.492410461046889, 
			4.641407626370017, 
			4.775107776797813, 
			4.878159517352676, 
			4.965026969072968, 
			5.029095996450118, 
			5.083056639428205, 
			5.123190343467674, 
			5.162370793925331, 
			5.196333673182337, 
			5.239165736839889, 
			5.277962209586186, 
			5.317495299217096, 
			5.3503048302906615, 
			5.3799177553558994, 
			5.402971984302982, 
			5.422427040693492, 
			5.436858119325646, 
			5.448747026078999, 
			5.457416502331538, 
			5.465202049665876, 
			5.471524123904689, 
			5.478795575517422, 
			5.485220383963838, 
			5.491553842882769, 
			5.4968617613201225, 
			5.5014312506518595, 
			5.505068210085758, 
			5.507594064898631, 
			5.509310099111301, 
			5.509324964553872, 
			5.508390373454173, 
			5.504536464843835, 
			5.499367016668368, 
			5.48976644537622, 
			5.480417457725103, 
			5.469949513149404, 
			5.461750001607338, 
			5.45368171025263, 
			5.4484711352002, 
			5.442521480932683, 
			5.438923234088276, 
			5.431338206174283, 
			5.424183399337731, 
			5.406015818609903, 
			5.38492586453838, 
			5.343056283859271, 
			5.3047333839758455, 
			5.262966704125803, 
			5.236376654910985, 
			5.216028400935506, 
			5.2178236324907425, 
			5.227224371501706, 
			5.262498837375355, 
			5.295213545635518, 
			5.348585192498629, 
			5.35839478064245, 
			5.356574182833784, 
			5.2121058261869555, 
			5.047731030853399, 
			4.8120904672448335, 
			4.600813355262799, 
			4.378609090854067, 
			4.205435646284671, 
			4.048534170389159, 
			3.943521249064281, 
			3.854298368934506, 
			3.8037720314363, 
			3.7433145298126407, 
			3.6938479319493243, 
			3.5873562109409227, 
			3.4841740805507473, 
			3.3600178995561234, 
			3.255372411222022, 
			3.153673462170221, 
			3.076762041222379, 
			3.0102139671844053, 
			2.9656110369964814, 
			2.9288917964849404, 
			2.9071165271133097, 
			2.883647218376102, 
			2.865121598163022, 
			2.830535086320769, 
			2.7984918589807704, 
			2.76166615699381, 
			2.7319420744388356, 
			2.704165101078185, 
			2.6846793458920675, 
			2.668850667718965, 
			2.6602921001274247, 
			2.6541434593688558, 
			2.653010376544515, 
			2.650543794175744, 
			2.649711527195247, 
			2.6419834474743755, 
			2.6358375390127606, 
			2.628243392186819, 
			2.625197561131913, 
			2.6240730790123123, 
			2.6290757410558134, 
			2.6368471496237786, 
			2.6511358549362, 
			2.666527583712979, 
			2.6871623059646272, 
			2.7032982057445207, 
			2.7209970290673198, 
			2.725048341657035, 
			2.7331255478341316, 
			2.739676036147391, 
			2.7587954164655626, 
			2.784467939827291, 
			2.8288391410997593, 
			2.882109440144073, 
			2.9573231843562686, 
			3.0356277712763884, 
			3.1327492235382186, 
			3.211382196727151, 
			3.294971114315392, 
			3.322416785900063, 
			3.3639437915393837, 
			3.3971522305025252, 
			3.4782484518102095, 
			3.5825448154098787, 
			3.7570468302302054, 
			3.959681946598871, 
			4.237049626289157, 
			4.505386788804274, 
			4.814125637991387, 
			4.999091555265005, 
			5.133057737273168, 
			4.967982472603898, 
			4.761574012242846, 
			4.450718961705931, 
			4.188804795794181, 
			3.929132534891414, 
			3.7434147655328642, 
			3.5880440745172977, 
			3.4972402079090155, 
			3.429078853375909, 
			3.4034298136675103, 
			3.3722533648495623, 
			3.3538633382471064, 
			3.2897952932376517, 
			3.2301148685817083, 
			3.1554179909653755, 
			3.0958062384286538, 
			3.038407454489436, 
			2.9982930976009774, 
			2.964984922617655, 
			2.946280722456278, 
			2.93259755287933, 
			2.9286754143684584, 
			2.923519514210454, 
			2.921386971394778, 
			2.908541810556019, 
			2.896552000369777, 
			2.8807067846168843, 
			2.868335227063266, 
			2.856304974485618, 
			2.84855804510028, 
			2.842395131169329, 
			2.8400903599770335, 
			2.838849115417756, 
			2.8402898683503226, 
			2.840730366643176, 
			2.8419129128942404, 
			2.8388403719304645, 
			2.836363737078192, 
			2.832704825855547, 
			2.8312742602855403, 
			2.8305581029749463, 
			2.8329207263846055, 
			2.8364493513612445, 
			2.8432229460539626, 
			2.850192093995726, 
			2.8596523189467797, 
			2.8661797988817024, 
			2.8731874134680617, 
			2.872273818712079, 
			2.873370006596957, 
			2.8733612092616063, 
			2.8800540931142278, 
			2.8899714380174757, 
			2.9097683128851664, 
			2.933819930528944, 
			2.969325531321502, 
			3.0056330135128926, 
			3.0516383450872206, 
			3.086380102859468, 
			3.123488894383002, 
			3.1283710575540655, 
			3.142066270413105, 
			3.1519399570917903, 
			3.191646385602037, 
			3.2474554892021605, 
			3.349060864388681, 
			3.4731230441021164, 
			3.6514863797666526, 
			3.835035159183414, 
			4.059036539941104, 
			4.21402884981262, 
			4.345403997959223, 
			4.253320448242044, 
			4.120310391712504, 
			3.881933370136388, 
			3.6695514197950905, 
			3.4413312553557533, 
			3.2710068549072617, 
			3.119725892042631, 
			3.0273035853257237, 
			2.9527795841980113, 
			2.920226423692282, 
			2.8779144988707865, 
			2.8473704159838493, 
			2.7610254723927152, 
			2.678222346553131, 
			2.576019560675666, 
			2.4918732614835424, 
			2.4103482248382746, 
			2.3507494141874092, 
			2.30006493541913, 
			2.268310656405536, 
			2.2432444813261934, 
			2.2309085154420645, 
			2.2171352435818936, 
			2.207448737282276, 
			2.1841736196639707, 
			2.1625292745081675, 
			2.136422964923577, 
			2.115464606796672, 
			2.0955126640733295, 
			2.081639140921318, 
			2.0702606833549924, 
			2.0641992015093846, 
			2.0598409980959977, 
			2.0591217213268083, 
			2.057464666572432, 
			2.0569292519669826, 
			2.0514604250585746, 
			2.046844426603787, 
			2.0409418528346883, 
			2.037746220682871, 
			2.035500124056758, 
			2.0368644526529915, 
			2.039732456028656, 
			2.046335429700625, 
			2.053457589723663, 
			2.0634774987941173, 
			2.0707825912905875, 
			2.0788274372794704, 
			2.0789541722408886, 
			2.081222911933287, 
			2.082455641392327, 
			2.0905932358354757, 
			2.102189520396212, 
			2.1240206577034093, 
			2.1505494557312796, 
			2.189072077293579, 
			2.2290492410745646, 
			2.2794038458043198, 
			2.319247367722564, 
			2.3620601155947614, 
			2.3731919060168796, 
			2.393293455537901, 
			2.409779674825225, 
			2.456249995825823, 
			2.5192489038838684, 
			2.628586993873316, 
			2.7612986266500563, 
			2.9493069808861505, 
			3.1438180807288254, 
			3.379873750194339, 
			3.548057146836966, 
			3.692895431658745, 
			3.6141523823031876, 
			3.49288565652867, 
			3.2645585300277333, 
			3.06024672416327, 
			2.838484091064038, 
			2.6731691114583147, 
			2.5258473736498015, 
			2.436522934147621, 
			2.364529513944481, 
			2.334035207058953, 
			2.293514139284544, 
			2.264474622124624, 
			2.1795059413969637, 
			2.097782265189669, 
			1.9964479172951632, 
			1.9128732202531644, 
			1.8317205881097243, 
			1.772235449183325, 
			1.7215193612615571, 
			1.6895141267752927, 
			1.6641430577938816, 
			1.6513426740209152, 
			1.6372332489136576, 
			1.6271628573332486, 
			1.6039059317768904, 
			1.5821522874653544, 
			1.5559814070943858, 
			1.534580528720154, 
			1.5140041008768492, 
			1.4989602526143848, 
			1.4861857519243207, 
			1.4781099917461482, 
			1.4717205110352887, 
			1.468469026459126, 
			1.464928485775835, 
			1.4624075988628613, 
			1.4566754536932094, 
			1.4513260796417464, 
			1.4449029769598793, 
			1.4396534747061942, 
			1.4346084634788254, 
			1.4309195152993295, 
			1.4277867534283657, 
			1.425804148450264, 
			1.4242346560823507, 
			1.4234327615854985, 
			1.4225613826764585, 
			1.4219393637412376, 
			1.4205342283915532, 
			1.4192210843385278, 
			1.417643857778954, 
			1.4163481304867755, 
			1.415095737061694, 
			1.4141618857544966, 
			1.4133458363521867, 
			1.4127776812222417, 
			1.4122588879344085, 
			1.4118337876372764, 
			1.4112360497060181, 
			1.4104165172700367, 
			1.4089186877731026, 
			1.4065604198704558, 
			1.4025839412651042, 
			1.3959178691004592, 
			1.3843996121345954, 
			1.3643580686503296, 
			1.3291622807107184, 
			1.2671845464402394, 
			1.1578023490618061, 
			0.9646188064369542, 
			0.6232692812470321, 
			0.0,  
	};
	
	public int nSteps() {
		return leftMotorSpeeds.length;
	}
	
	public double leftSpeed(int i) {
		return (0.288 * Math.log(leftMotorSpeeds[i]) + 0.4);
	}
	public double rightSpeed(int i) {
		return (0.288 * Math.log(rightMotorSpeeds[i]) + 0.4);
	}

}
