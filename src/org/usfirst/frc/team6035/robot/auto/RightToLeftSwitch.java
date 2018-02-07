package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class RightToLeftSwitch extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 6.082871, 9.494071, 11.423812, 12.515392, 13.132758, 13.481781, 13.678956, 13.790142, 13.852657, 13.887545, 13.906836, 13.917222, 13.922706, 13.925270, 13.926191, 13.925975, 13.925043, 13.923419, 13.921289, 13.918500, 13.915269, 13.911378, 13.907284, 13.902727, 13.898521, 13.893902, 13.889104, 13.883349, 13.876762, 13.868522, 13.858876, 13.846903, 13.833327, 13.817160, 13.800237, 13.781456, 13.764182, 13.745219, 13.725549, 13.701911, 13.674832, 13.640879, 13.601096, 13.551608, 13.495488, 13.428558, 13.358661, 13.281094, 13.210427, 13.132713, 13.052288, 12.954797, 12.842685, 12.700717, 12.533799, 12.324528, 12.087500, 11.803777, 11.511975, 11.190620, 10.915210, 10.615281, 10.316793, 9.947468, 9.528108, 8.986885, 8.368887, 7.602885, 6.814650, 5.949655, 5.318439, 4.860453, 5.073150, 5.498180, 6.225383, 6.918960, 7.636108, 8.219584, 8.743153, 9.141378, 9.494257, 9.769034, 10.053710, 10.313650, 10.643308, 10.945977, 11.251077, 11.505887, 11.734349, 11.914228, 12.067130, 12.184033, 12.284256, 12.362889, 12.439275, 12.507078, 12.586771, 12.658488, 12.729122, 12.787316, 12.838517, 12.877656, 12.909545, 12.931955, 12.949189, 12.959988, 12.968825, 12.974330, 12.981596, 12.986250, 12.989846, 12.989404, 12.985677, 12.976763, 12.963015, 12.943054, 12.917160, 12.884434, 12.845842, 12.801424, 12.753640, 12.702544, 12.648181, 12.588577, 12.521709, 12.444212, 12.352984, 12.244102, 12.114795, 11.962247, 11.786979, 11.590356, 11.379831, 11.158797, 10.927035, 10.677485, 10.401760, 10.085225, 9.715926, 9.275301, 8.756313, 8.144728, 7.462643, 6.720102, 6.020224, 5.367266, 4.825751, 4.354516, 3.980376, 3.643554, 3.357001, 3.063935, 2.785350, 2.476700, 2.194478, 1.909082, 1.746766, 1.623130, 1.594430, 1.579217, 1.608046, 1.620975, 1.642408, 1.633039, 1.620856, 1.580400, 1.553477, 1.520367, 1.544108, 1.572822, 1.629256, 1.676513, 1.728657, 1.764372, 1.795458, 1.809814, 1.819364, 1.816520, 1.816505, 1.812764, 1.825807, 1.838041, 1.856622, 1.869662, 1.881970, 1.886524, 1.887824, 1.881228, 1.872168, 1.856842, 1.843588, 1.827986, 1.822447, 1.814346, 1.808042, 1.793629, 1.774912, 1.743791, 1.705776, 1.652701, 1.594950, 1.523271, 1.458752, 1.388626, 1.348761, 1.300423, 1.257109, 1.186756, 1.104491, 0.984799, 0.857897, 0.707193, 0.607972, 0.575605, 0.626966, 0.742290, 0.687429, 0.623036, 0.483927, 0.413470, 0.403370, 0.430603, 0.494049, 0.531257, 0.569603, 0.577392, 0.601769, 0.618831, 0.694783, 0.769680, 0.865879, 0.945444, 1.023440, 1.080190, 1.128526, 1.158164, 1.181354, 1.191851, 1.204043, 1.212202, 1.234438, 1.255011, 1.280155, 1.299821, 1.318298, 1.330122, 1.339146, 1.342129, 1.343234, 1.340036, 1.338212, 1.334996, 1.338220, 1.340053, 1.343262, 1.342170, 1.339202, 1.330195, 1.318387, 1.299928, 1.280277, 1.255145, 1.234572, 1.212330, 1.204149, 1.191930, 1.181398, 1.158165, 1.128469, 1.080049, 1.023178, 0.945005, 0.865199, 0.768672, 0.693396, 0.617003, 0.599605, 0.574915, 0.566986, 0.528636, 0.491897, 0.429674, 0.405500, 0.421912, 0.497550, 0.641570, 0.709321, 0.766045, 0.647248, 0.588090, 0.604869, 0.696567, 0.844933, 0.971519, 1.092261, 1.175716, 1.247429, 1.291827, 1.341230, 1.382055, 1.453471, 1.519533, 1.593149, 1.653276, 1.709082, 1.750446, 1.785153, 1.808197, 1.826743, 1.837755, 1.849240, 1.858158, 1.874171, 1.888654, 1.904920, 1.917565, 1.928975, 1.936231, 1.941553, 1.943161, 1.943538, 1.941258, 1.939800, 1.937412, 1.938949, 1.939379, 1.940415, 1.938324, 1.934677, 1.926607, 1.916327, 1.901052, 1.884677, 1.864025, 1.846456, 1.827351, 1.818421, 1.806187, 1.794865, 1.773491, 1.746565, 1.704464, 1.654674, 1.586860, 1.515758, 1.429133, 1.356431, 1.279806, 1.247514, 1.205880, 1.173120, 1.107190, 1.029481, 0.908031, 0.782741, 0.631184, 0.541020, 0.515607, 0.533190, 0.606110, 0.530140, 0.524265, 0.593545, 0.712070, 0.880052, 1.016595, 1.144976, 1.229192, 1.300326, 1.339212, 1.385368, 1.422111, 1.498820, 1.570971, 1.654931, 1.723882, 1.789139, 1.837484, 1.878444, 1.905423, 1.927170, 1.939782, 1.953025, 1.963246, 1.982249, 1.999845, 2.020072, 2.036657, 2.052345, 2.063986, 2.073867, 2.080394, 2.085666, 2.088734, 2.091947, 2.094424, 2.099014, 2.103265, 2.108157, 2.112172, 2.115975, 2.118799, 2.121200, 2.122788, 2.124071, 2.124820, 2.125603, 2.126207, 2.127324, 2.128358, 2.129545, 2.130517, 2.131430, 2.132093, 2.132630, 2.132928, 2.133076, 2.132960, 2.132611, 2.131797, 2.130354, 2.127574, 2.122500, 2.113258, 2.096720, 2.067255, 2.015001, 1.922469, 1.758786, 1.469346, 0.957649, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 6.083103, 9.494550, 11.424560, 12.516464, 13.134195, 13.483676, 13.681357, 13.793171, 13.856327, 13.891967, 13.911891, 13.922946, 13.928756, 13.931760, 13.933096, 13.933645, 13.933669, 13.933529, 13.933139, 13.932715, 13.931944, 13.931057, 13.929470, 13.927601, 13.924593, 13.921652, 13.918405, 13.915673, 13.912907, 13.910702, 13.908174, 13.905943, 13.902536, 13.898836, 13.892365, 13.884829, 13.872657, 13.860827, 13.847806, 13.837025, 13.826250, 13.818017, 13.808740, 13.801106, 13.789092, 13.776522, 13.753081, 13.726011, 13.680085, 13.636506, 13.588943, 13.552663, 13.518851, 13.499680, 13.481065, 13.476761, 13.462233, 13.456889, 13.415274, 13.371241, 13.250557, 13.153423, 13.051554, 13.025651, 13.042031, 13.173219, 13.362177, 13.690179, 14.034046, 14.484393, 14.757741, 14.974859, 14.658892, 14.291416, 13.755539, 13.337623, 12.948451, 12.708516, 12.535637, 12.482434, 12.476230, 12.547212, 12.617461, 12.713180, 12.741270, 12.770701, 12.770155, 12.780294, 12.782905, 12.799330, 12.816801, 12.847476, 12.880331, 12.923022, 12.961992, 13.002796, 13.026762, 13.047250, 13.057838, 13.067484, 13.072693, 13.078653, 13.082786, 13.088173, 13.092270, 13.097087, 13.099212, 13.100360, 13.095778, 13.089670, 13.080187, 13.069878, 13.057115, 13.043108, 13.025994, 13.006378, 12.981977, 12.953523, 12.918211, 12.878063, 12.830049, 12.779939, 12.725836, 12.670194, 12.609251, 12.543261, 12.466641, 12.379219, 12.273610, 12.151460, 12.003794, 11.838383, 11.646010, 11.449650, 11.243622, 11.039257, 10.823999, 10.602795, 10.357237, 10.094325, 9.789106, 9.460112, 9.067470, 8.653532, 8.135846, 7.640359, 7.122216, 6.672764, 6.246296, 5.905158, 5.604310, 5.388372, 5.206894, 5.094856, 4.976125, 4.884127, 4.687032, 4.492278, 4.241103, 4.021647, 3.794937, 3.618741, 3.459312, 3.351836, 3.260765, 3.208705, 3.149009, 3.101652, 3.001985, 2.906243, 2.790908, 2.694101, 2.599923, 2.529211, 2.468181, 2.428072, 2.395335, 2.376963, 2.356664, 2.341104, 2.309419, 2.280299, 2.246403, 2.219937, 2.195590, 2.180241, 2.168786, 2.165602, 2.164697, 2.169717, 2.171913, 2.175904, 2.169154, 2.165036, 2.159011, 2.161118, 2.166994, 2.184487, 2.207304, 2.243282, 2.281201, 2.330297, 2.368917, 2.410808, 2.420328, 2.438921, 2.453637, 2.498616, 2.560172, 2.668410, 2.800186, 2.987581, 3.181652, 3.417534, 3.585621, 3.730497, 3.651592, 3.530175, 3.301556, 3.097031, 2.875040, 2.709645, 2.562297, 2.473117, 2.401308, 2.371139, 2.330866, 2.302120, 2.217162, 2.135515, 2.034207, 1.950874, 1.870068, 1.811247, 1.761345, 1.730517, 1.706384, 1.695131, 1.682305, 1.673619, 1.650940, 1.630017, 1.604600, 1.584729, 1.566097, 1.554158, 1.545047, 1.542000, 1.540846, 1.544009, 1.545809, 1.549013, 1.545789, 1.543968, 1.540783, 1.541910, 1.544927, 1.553998, 1.565892, 1.584465, 1.604271, 1.629608, 1.650454, 1.673046, 1.681671, 1.694418, 1.705587, 1.729585, 1.760240, 1.809880, 1.868371, 1.948716, 2.031510, 2.132123, 2.213070, 2.297214, 2.325362, 2.364886, 2.394275, 2.464883, 2.552543, 2.697631, 2.860242, 3.078430, 3.278755, 3.502259, 3.619360, 3.694179, 3.548917, 3.381259, 3.147798, 2.955776, 2.770802, 2.640335, 2.533068, 2.471205, 2.425633, 2.409336, 2.389659, 2.378767, 2.337296, 2.298753, 2.250096, 2.211465, 2.174237, 2.148538, 2.127346, 2.115953, 2.107880, 2.106395, 2.103958, 2.103555, 2.095671, 2.088432, 2.078570, 2.071315, 2.064444, 2.060898, 2.058645, 2.059542, 2.061262, 2.065292, 2.068253, 2.071906, 2.071431, 2.071797, 2.071285, 2.073591, 2.077132, 2.084751, 2.094204, 2.108257, 2.122962, 2.141503, 2.156473, 2.172582, 2.178113, 2.186764, 2.194265, 2.211609, 2.234109, 2.271313, 2.315480, 2.376885, 2.440556, 2.518856, 2.582286, 2.649288, 2.671970, 2.705350, 2.731974, 2.795525, 2.876771, 3.012056, 3.168867, 3.383314, 3.591297, 3.831487, 3.978235, 4.087553, 3.965353, 3.809592, 3.568267, 3.362630, 3.155268, 3.005236, 2.877737, 2.801884, 2.743536, 2.719783, 2.690564, 2.671519, 2.613012, 2.557944, 2.489758, 2.434594, 2.381413, 2.343373, 2.311403, 2.292261, 2.277634, 2.271567, 2.264602, 2.260345, 2.247084, 2.234651, 2.219036, 2.206385, 2.194071, 2.185262, 2.177816, 2.173384, 2.169995, 2.168639, 2.167053, 2.166110, 2.162987, 2.160048, 2.156322, 2.153298, 2.150343, 2.148227, 2.146434, 2.145368, 2.144551, 2.144225, 2.143843, 2.143615, 2.142856, 2.142138, 2.141225, 2.140476, 2.139734, 2.139179, 2.138677, 2.138306, 2.137918, 2.137512, 2.136855, 2.135812, 2.133900, 2.130677, 2.125075, 2.115384, 2.098405, 2.068585, 2.016010, 1.923222, 1.759311, 1.469683, 0.957813, 0.000000
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
