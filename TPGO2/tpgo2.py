import networkx as nx
import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
from networkx.drawing.nx_agraph import write_dot, graphviz_layout


G1=nx.Graph()
G1.add_node('R1')
G1.add_node('R2')
G1.add_node('R3')
G1.add_edge('R1','R3')
nx.draw(G1)
plt.show()

