import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("Engine.csv.csv")
print(df)

def bar_plot():
    enginesize = np.array(df['ENGINESIZE'])
    fuel_consump = np.array(df["FUELCONSUMPTION_COMB"])

    plt.bar(enginesize,fuel_consump)

    plt.ylabel("Fuel Consumption")
    plt.xlabel("ENginesize")

    plt.title("Fuel Consumption VS Enginesize")

    plt.show()

# bar_plot()

def scatter_plot():
    enginesize = np.array(df['ENGINESIZE'])
    emssions = np.array(df["CO2EMISSIONS"])

    plt.scatter(enginesize,emssions)

    plt.ylabel("Emissions")
    plt.xlabel("ENginesize")

    plt.title("Emissions VS Enginesize")

    plt.show()

scatter_plot()

