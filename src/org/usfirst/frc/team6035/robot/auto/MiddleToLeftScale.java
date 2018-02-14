package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class MiddleToLeftScale extends AutoDirection {

	private double[] leftMotorSpeeds = { 0.0, 1.1453429485105928, 1.7850126926893142, 2.146851695915685,
			2.351492877306808, 2.4671920376699914, 2.5325416399774587, 2.5693955885696966, 2.5900780454173535,
			2.6016035750000155, 2.607875745171827, 2.6111877733445374, 2.6127344564302795, 2.6133591740186843,
			2.6133773986318816, 2.613281833938715, 2.613066067107386, 2.613229011383097, 2.6133584667535716,
			2.613602929634207, 2.6136564321385327, 2.6136220658629337, 2.6132816628866453, 2.6127435984804364,
			2.611802074796057, 2.610607025213329, 2.6089099364776405, 2.606985284335324, 2.604515749872406,
			2.6020740364147485, 2.599269553380945, 2.5972573716709797, 2.5954502427426958, 2.5957003649451034,
			2.5960475142095185, 2.5970366232587128, 2.597296152546435, 2.5972392050875834, 2.5959230310311607,
			2.593799171858568, 2.5900040878593016, 2.585162439277489, 2.578246654821116, 2.5703913923170205,
			2.5602910554024914, 2.550303837334464, 2.5388252152392465, 2.5306063177905855, 2.5232352543691996,
			2.524330143020125, 2.5258310754687185, 2.5299801348903586, 2.531136992958445, 2.5310021394314446,
			2.5257022387678387, 2.517097484538266, 2.501645682836215, 2.4819207980197873, 2.4537128158696073,
			2.421696254267531, 2.3805267411471065, 2.339917673257502, 2.2933043877988646, 2.2602496000112287,
			2.230856237723742, 2.2364568243621097, 2.2438562317794775, 2.2622692371827537, 2.2685020430570177,
			2.2696109677119627, 2.2497814808556593, 2.2168389363690433, 2.1565037442897843, 2.0797271515877465,
			1.9697971814946031, 1.846616392944345, 1.6893322954231078, 1.5387858996825479, 1.3695691028422037,
			1.2617036740927428, 1.1753671025203805, 1.232956951213982, 1.3011618466118462, 1.414433548331147,
			1.4847947644186779, 1.541283303825246, 1.5301936731443908, 1.4865446533999234, 1.3693249346295675,
			1.2292150812789235, 1.0269140411843414, 0.8489457757782227, 0.6553322105320553, 0.5935484096571508,
			0.6189259055267315, 0.7175591291253747, 0.9761504337370096, 1.491218883339531, 2.0297408173931197,
			2.6140037582355555, 3.1039362499410603, 3.540135270620693, 3.8780928150330984, 4.15727176412486,
			4.364722096522042, 4.53052626644644, 4.650095149266082, 4.746416607692228, 4.815925082463683,
			4.879942838122539, 4.933247022445413, 5.00096104554496, 5.071860682695868, 5.175343702208515,
			5.275411355593411, 5.37969929935219, 5.468765708762184, 5.549543268335361, 5.614150773393494,
			5.669004811453625, 5.711319783754232, 5.746246790970038, 5.772779565711139, 5.795009099729544,
			5.81232343051787, 5.82849718618828, 5.842693558131944, 5.859261084340664, 5.876302951557897,
			5.89892706956158, 5.920785143831604, 5.943248762890523, 5.962861980857855, 5.980877099917256,
			5.996027718129102, 6.009435441897665, 6.020922477700986, 6.0312375920407355, 6.040713129276445,
			6.0495603313550435, 6.058377462477061, 6.066586680213497, 6.07494288629107, 6.0816254208519025,
			6.0877074804933615, 6.089948213447678, 6.091827762013713, 6.092372972232097, 6.094145244923789,
			6.096365311210784, 6.100971839552796, 6.107007308025558, 6.1164364273647465, 6.127758358917393,
			6.143450777699373, 6.1606177234255375, 6.1825127956166, 6.203066801609743, 6.226430060490101,
			6.240442060881591, 6.25161066417344, 6.240511976996433, 6.228619260160016, 6.21018711375767,
			6.200051917390472, 6.193570496161608, 6.200795578085589, 6.216518114744603, 6.249942433928096,
			6.293928526441829, 6.359631622720501, 6.43434429716688, 6.532621124768466, 6.628232167491587,
			6.739548483589063, 6.813219402904297, 6.877197165858554, 6.8444922320227, 6.808491737367848,
			6.74313353667868, 6.713600222019162, 6.699682829934325, 6.7455061802930265, 6.828816632756,
			6.9890483635257485, 7.195265235575517, 7.4928303397831275, 7.825307819440188, 8.247351916524694,
			8.644095063642585, 9.07997233240489, 9.342707754623298, 9.538130072909471, 9.381135571916714,
			9.19269607319404, 8.907372062237325, 8.683403294564371, 8.46815469415562, 8.32365096636905,
			8.208119904344697, 8.148087730558982, 8.114646719558817, 8.1232136682983, 8.15236549578948,
			8.214332327999522, 8.286817310478627, 8.380684213499805, 8.46298685587162, 8.545614809414637,
			8.581019421022813, 8.60748997667674, 8.61062565237608, 8.61396911532036, 8.609411118762527,
			8.60917670960913, 8.607728743755773, 8.611639783787112, 8.61703987924954, 8.628033075169373,
			8.641457304169284, 8.660382091573732, 8.68094937022385, 8.70562065082507, 8.727867003098886,
			8.749980357303428, 8.761693333320304, 8.770740198455517, 8.77388472850939, 8.776299697743552,
			8.776260090712116, 8.776622986161838, 8.77619597147961, 8.77655103466914, 8.776781581379199,
			8.77785581823843, 8.778940064491175, 8.780753940261395, 8.782227648164602, 8.784001780299555,
			8.784343847784259, 8.784071295712032, 8.7806152862857, 8.776573957223176, 8.77113951117642,
			8.765872818506395, 8.76011079156542, 8.754553507758946, 8.748509178757725, 8.742221318991115,
			8.734929045347949, 8.726680196579231, 8.7165627790983, 8.704629054676849, 8.689733260455224,
			8.672249810709419, 8.650830472795944, 8.626889335554178, 8.599217833871153, 8.571785261986676,
			8.54425617278175, 8.5184061824111, 8.493014168396352, 8.468321231290444, 8.442464027128198,
			8.414972544565504, 8.383419887840523, 8.34711809580459, 8.302916863775687, 8.250441377652828,
			8.185707600259967, 8.109854422362574, 8.018450660634178, 7.91698538212554, 7.801964523780396,
			7.688755866608561, 7.57646593998366, 7.472102528746692, 7.371071061912233, 7.274710704037021,
			7.175964438750898, 7.074020208057188, 6.959941769316418, 6.83331907841124, 6.682928619656971,
			6.511816007341359, 6.305271587489023, 6.075008971485326, 5.798047030960561, 5.502912287383796,
			5.1407071413213865, 4.793367337280207, 4.432332969742896, 4.115177961979232, 3.811577170121944,
			3.560122377950758, 3.333804172727259, 3.159369812854772, 3.0140227003331, 2.9179951362989542,
			2.8500976722963474, 2.829329411359308, 2.8286882060571887, 2.8690792513211214, 2.897127593560975,
			2.936080110769599, 2.867859763428301, 2.7827643896158247, 2.623242460724546, 2.470697156082104,
			2.288982634936958, 2.137146579062637, 1.9882889118918303, 1.8805530435169902, 1.7912243725522994,
			1.7452015071649107, 1.7203135520427897, 1.7355933758566495, 1.7621956054902477, 1.8171929590241314,
			1.8502802842775, 1.8810591502813614, 1.823801311867228, 1.7527366064781487, 1.6381208196050983,
			1.5340484544006607, 1.4221110286789076, 1.3331657294359796, 1.2523340353507735, 1.1961506361922862,
			1.1521781719910646, 1.1302382179107278, 1.1188705597096593, 1.125518572394833, 1.1362666528133318,
			1.158073498138885, 1.1688837033132629, 1.177783954145303, 1.151386538946978, 1.1213352789829245,
			1.0773450158169262, 1.0402677431005494, 1.0032214705283087, 0.977566525184114, 0.9573674828683892,
			0.949290187275422, 0.9478669565190745, 0.95827029315071, 0.9741931313249598, 1.0008809821983842,
			1.028377408716598, 1.06258166364632, 1.0854513529522907, 1.105584564308962, 1.0950480446901012,
			1.0826138615048675, 1.0600342234596682, 1.0467716696479241, 1.0367293366135495, 1.042266471720571,
			1.0570877026999925, 1.0913259464044132, 1.13697898701636, 1.2051456536477845, 1.2824184319339273,
			1.3822894230555913, 1.4785903371516715, 1.587750161532849, 1.6601222538336573, 1.721221080036433,
			1.6964764409227155, 1.6672839430959923, 1.6127628446804845, 1.5854446268070204, 1.5683517822440929,
			1.5939190202655429, 1.643010941297452, 1.7417413102906374, 1.8639330649411148, 2.0369868040809744,
			2.217267658161272, 2.4366224097502, 2.6187551222987713, 2.804380183869325, 2.8738537490650016,
			2.89754344719615, 2.7318585434144214, 2.5568165210720752, 2.3402741120895687, 2.164842346498838,
			2.002293962028618, 1.883897898667214, 1.7866939604843524, 1.7233632492023334, 1.677516507081089,
			1.6560312651051834, 1.6464776329513924, 1.6542278833644801, 1.6666749710320719, 1.688962836764097,
			1.7035928830722602, 1.7173631999157097, 1.706314103994445, 1.6925541522496512, 1.669119863804434,
			1.6491721936760526, 1.6282041782184653, 1.612603223751388, 1.5988748366741734, 1.590130960645481,
			1.5837392554513772, 1.5814783920336726, 1.5811877120014073, 1.5841756218075802, 1.58805280691315,
			1.5939673417328648, 1.5983350589350829, 1.6025247713924196, 1.6013114940445599, 1.5993137093787506,
			1.5949524401195705, 1.5911431471516435, 1.5869085276286017, 1.5837369989338008, 1.5808758350356507,
			1.5790754095994282, 1.5777595142333625, 1.577362097677723, 1.5773993975096514, 1.5781883862657744,
			1.5791809267854908, 1.5806510639667835, 1.5817595006168768, 1.582825635140691, 1.5826069414926038,
			1.582190641712088, 1.5811977264119417, 1.5803239901700952, 1.579337234967249, 1.5785968440000149,
			1.577924345265608, 1.5775023081973776, 1.577193632822562, 1.5771041433675905, 1.5771181746693683,
			1.5773128575946391, 1.5775564826020108, 1.5779154680153353, 1.5781872787337854, 1.5784488636524177,
			1.578399344485452, 1.578301225925908, 1.5780625033403495, 1.5778516436380736, 1.577612415474375,
			1.5774319034791338, 1.5772668945197976, 1.5771613744363753, 1.5770820420885128, 1.5770537499549135,
			1.5770480611397037, 1.577081688607888, 1.5771211306534514, 1.5771772822758492, 1.5771951482045359,
			1.5771782712110567, 1.577032194363477, 1.5767730927950976, 1.5763018359021774, 1.5755192371341613,
			1.5741692435558665, 1.5718414222647743, 1.5677664772594597, 1.560610703279845, 1.547993981786942,
			1.525725458167881, 1.4863858625014965, 1.4168707267676828, 1.2940109637089137, 1.0768586487738616,
			0.6930320465472778, 0.0,

	};

	private double[] rightMotorSpeeds = { 0.0, 1.1455057974565845, 1.785351678629525, 2.147386548968283,
			2.352269216975038, 2.4682524531384153, 2.5339722737199946, 2.571265835810134, 2.5925267260118345,
			2.6047237689229834, 2.6118643133400394, 2.616130001602724, 2.6188577766851426, 2.620635734049942,
			2.621958985210802, 2.6227926290666654, 2.6234042414507814, 2.6234421445805585, 2.6234060105981745,
			2.6231945024117564, 2.6231415117160863, 2.623157356365462, 2.623467986829097, 2.6239670638760644,
			2.624861340263074, 2.6259987607864415, 2.6276264687992863, 2.6294659793129944, 2.631832977862014,
			2.634150135058469, 2.6368086750085356, 2.6386505723065814, 2.6402706507892044, 2.639818846541814,
			2.6392741004127194, 2.6380923486336467, 2.6376508175731854, 2.6375298953282877, 2.638669601705127,
			2.640607522725693, 2.644200547236367, 2.648810143765321, 2.6554558882867636, 2.6629867981654156,
			2.6727025847155494, 2.6822288393072706, 2.693174503671852, 2.700780082669398, 2.7074877910647164,
			2.705689476623941, 2.7035119201964437, 2.6987161692629202, 2.6969614271468205, 2.696525899531085,
			2.7012752132839237, 2.7093174734590213, 2.7241793097976226, 2.7432529506895067, 2.770737573461136,
			2.8019304926424065, 2.8421862655693166, 2.8817841248263107, 2.9273444300074463, 2.9593376947470844,
			2.9877747943117012, 2.981385327633124, 2.9734720885031396, 2.954825687345102, 2.9486418914366213,
			2.9478670154651168, 2.9683416158032596, 3.0023254133089425, 3.0642289336152504, 3.1433463106210953,
			3.2567090557634204, 3.384941049237168, 3.549501209465738, 3.7104841850158627, 3.8941288889509202,
			4.021586872737461, 4.1329249587623735, 4.106031172414723, 4.072048364802353, 3.996289773250299,
			3.9654687389224486, 3.9518696536251983, 4.010111172651567, 4.108742325204644, 4.2922381529537805,
			4.51674418025713, 4.828674651798491, 5.15395658975523, 5.545827573837757, 5.876605289936468,
			6.2153733260818145, 6.373082448359594, 6.469894462936889, 6.296857384032427, 6.124130675133245,
			5.9039024720168385, 5.743903633748101, 5.601289979739238, 5.512767262715347, 5.446881543895464,
			5.418823739400214, 5.408541799311612, 5.4254492058303185, 5.455641571788943, 5.506989211244302,
			5.565465755258002, 5.638016293888869, 5.703890009148925, 5.770218868574841, 5.806896355159862,
			5.836816950118715, 5.850846606106804, 5.863188770749905, 5.869018038804277, 5.8758662774164385,
			5.880659538391646, 5.887532016719118, 5.89447222981995, 5.904053883458887, 5.914739260998348,
			5.928371742146738, 5.9431136242307145, 5.960297225560856, 5.976705500217394, 5.993269185603163,
			6.0047394476068945, 6.0143191348884075, 6.020301476862271, 6.024904001106241, 6.0273881475753965,
			6.028940114194784, 6.029218138566737, 6.028704827355377, 6.027350465764104, 6.02516300179075,
			6.022460092562722, 6.018903733899749, 6.0154383565244105, 6.011441413502431, 6.008940177134962,
			6.006794664601155, 6.0082579411281305, 6.009510290751855, 6.0114644424096495, 6.011390261198701,
			6.0100436833976225, 6.0054043933703545, 5.998367091758144, 5.9868845298221185, 5.972299955107357,
			5.9520244085040765, 5.928689117609116, 5.89894974306451, 5.868561213247399, 5.8334831966403495,
			5.805696245901828, 5.779371610411613, 5.774150592220807, 5.770097472406934, 5.773020692027337,
			5.768519207723818, 5.760696562342354, 5.73927516489758, 5.708607858774638, 5.6590100897446876,
			5.59660277248198, 5.50976109601647, 5.410139350669616, 5.283096729859636, 5.154104735698786,
			5.0057889304220415, 4.891655193806631, 4.786674479702677, 4.779177131737671, 4.780124515248155,
			4.815800809561579, 4.821816973599324, 4.817528722425841, 4.758823484532145, 4.667830937325494,
			4.506251796798491, 4.3070013963210965, 4.028527497597756, 3.733104259114855, 3.374142016191148,
			3.0777711478220615, 2.790670078460053, 2.7378048876842187, 2.8146043614619964, 3.302890147677673,
			3.8454548156449433, 4.491348722655094, 5.051546906115443, 5.574300501383668, 5.986337511875735,
			6.3355229536910365, 6.59561051773956, 6.805287878287843, 6.953535102391224, 7.071588230695464,
			7.151800827763481, 7.224846613868771, 7.281812615532794, 7.360876853670496, 7.44521929379887,
			7.581496301479453, 7.7151951569673125, 7.858628228722005, 7.981461031218622, 8.094181031848834,
			8.183901715068624, 8.260193775406576, 8.31805313407701, 8.36521685923609, 8.399494963226728,
			8.42722363719571, 8.446863570494841, 8.464691177031094, 8.478878299409104, 8.497374759611073,
			8.516718494495898, 8.547013509299909, 8.576642099361049, 8.60840428354327, 8.635566757750055,
			8.660444173394048, 8.680037308274544, 8.696435676257265, 8.708389303683466, 8.717570310282728,
			8.723364050236778, 8.727120840640358, 8.728382623264451, 8.728513855846959, 8.72705633746381,
			8.725891375063126, 8.72438023566691, 8.725176428549512, 8.725926275131387, 8.727388538562682,
			8.727993916818258, 8.728126395919743, 8.72686873466576, 8.724402454433035, 8.720098037270366,
			8.713938362095941, 8.705363947396195, 8.694219822285444, 8.679989387006216, 8.662605083394588,
			8.641828355596202, 8.618201359982681, 8.592275517850979, 8.565790675643866, 8.539769229685826,
			8.514763992951107, 8.490526929535362, 8.466462020227574, 8.441520316405464, 8.414443962865333,
			8.38370264838666, 8.347583460333064, 8.304205437086813, 8.251587149748657, 8.187840728406691,
			8.111420660352593, 8.021617960414877, 7.91926592251213, 7.807255319735062, 7.691373827482792,
			7.577706302606463, 7.468268603705458, 7.3628039035039, 7.258548449880686, 7.1511058407846875,
			7.03494142988059, 6.902991584131661, 6.7477825842676875, 6.5598260907647905, 6.33050446231737,
			6.048705204389142, 5.708731094438184, 5.30281185926943, 4.84321316449806, 4.3394853627075305,
			3.8568089029395383, 3.4071118143900203, 3.03499097463783, 2.7204046280288776, 2.4826497767557942,
			2.286601579290382, 2.138744218105849, 2.004044281588736, 1.885571608168085, 1.753234928156722,
			1.6121467805596434, 1.4357083287716494, 1.2389265254960264, 0.9983948398081824, 0.7611562932030193,
			0.5116986563713555, 0.37064530400739737, 0.2713828489424083, 0.2350748262216362, 0.22619790853403582,
			0.27356444113254486, 0.3172113060684175, 0.3776912247549547, 0.4140639020309803, 0.44413360117256684,
			0.44078275474242473, 0.4230764931943174, 0.37145175807411956, 0.3143499257849315, 0.2381981943411142,
			0.19908906634120613, 0.19182068064391014, 0.16164993371145883, 0.1720049249322386, 0.20636053269335486,
			0.2545534128634182, 0.3261017124163234, 0.38554433549581235, 0.444044679685575, 0.4831073480312832,
			0.5133484157668848, 0.5239720753196812, 0.5254039275144838, 0.5096788885629324, 0.49006810352947355,
			0.459423478680426, 0.43945955421122557, 0.4213456741992903, 0.4384986589775748, 0.4601167695097066,
			0.49655925795388434, 0.5272850928277055, 0.559027222546925, 0.5804344742592704, 0.59723690971263,
			0.6026889020238984, 0.6020889320376104, 0.5901862907030389, 0.573177297341649, 0.545765334798321,
			0.5178494005419636, 0.48350554949423774, 0.46075809399428225, 0.44099416015205023, 0.4521474010760803,
			0.4654146756101559, 0.4890782358871742, 0.5037175427041948, 0.515576106573063, 0.5124981129143039,
			0.5011807041229446, 0.47208769210100593, 0.4343023520356981, 0.3784375617436953, 0.3209563151632864,
			0.2534259288028139, 0.2110123965307584, 0.19261600732558753, 0.19182784972998113, 0.21410326332670557,
			0.1765009593787623, 0.162444344771546, 0.16126841814304466, 0.16892973900549016, 0.19135797253151068,
			0.193118474558184, 0.19827384344738416, 0.19388878092001455, 0.2326130473526924, 0.33411688417526597,
			0.4573440123850017, 0.6251679923872782, 0.7555060912350401, 0.8886447812760132, 0.9063149195137913,
			0.8894296630491502, 0.7096884851506055, 0.582485778724674, 0.5226768665501399, 0.567107645649993,
			0.6773268480701643, 0.7830517291958233, 0.8877230818306774, 0.9671678215954906, 1.033059086196626,
			1.0756831963457512, 1.1071527757834938, 1.1217477964532632, 1.1328600559568718, 1.1353030934060695,
			1.1472364672706465, 1.1609117727043556, 1.2000757995549358, 1.23994363482622, 1.2871584954768012,
			1.3274971268424258, 1.3658873889604262, 1.3958712619057208, 1.421616696115633, 1.4402844807279152,
			1.4551411212794003, 1.4647252217868016, 1.471714943644687, 1.4750513886799983, 1.4775181561247925,
			1.4780663658795528, 1.4805110352513662, 1.4832812941579328, 1.4915717421710137, 1.5001110616959537,
			1.5104099216251956, 1.5192974699808182, 1.527861840024626, 1.5346018294859458, 1.540440120791566,
			1.54469607602803, 1.5481040899378342, 1.550309555855078, 1.5519245348257804, 1.5526939730986529,
			1.5532633736622716, 1.5533832553129048, 1.5539497781670646, 1.5545939241432605, 1.5565508164626431,
			1.5585730497513648, 1.5610230374149388, 1.5631425186261045, 1.5651910402116218, 1.5668062295809613,
			1.5682083205158108, 1.5692319112149464, 1.5700529026956431, 1.5705849381723336, 1.5709751110637522,
			1.571161461462757, 1.5712995226067101, 1.57132889797084, 1.5714660247126258, 1.5716218518321374,
			1.5720954542940462, 1.5725852397370594, 1.5731791476010404, 1.573693442170888, 1.5741909570640782,
			1.5745837693697393, 1.5749250704814681, 1.5751747334703305, 1.5753749284383776, 1.5755045790609299,
			1.5755980495989705, 1.5756393953729508, 1.5756627042935807, 1.5756495460217266, 1.5756422833239456,
			1.575606445061133, 1.5755862959427014, 1.5754686004747542, 1.5751959047467132, 1.5745887634395306,
			1.5734184513535645, 1.5712357071834004, 1.567292859194845, 1.5602392334596673, 1.5477104986841146,
			1.52550884454426, 1.4862255615975541, 1.4167536352429264, 1.293930603068683, 1.0768080799131847,
			0.6930082682827278, 0.0,

	};

	public int nSteps() {
		return leftMotorSpeeds.length;
	}

	public double leftSpeed(int i) {
		return leftMotorSpeeds[i];
	}

	public double rightSpeed(int i) {
		return rightMotorSpeeds[i];
	}

}
