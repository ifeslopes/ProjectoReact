import BarChar from "components/BarChar";
import Datatable from "components/DataTable";
import DonutChar from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashborad = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3"> Dashbord de vendas!</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa De Sucesso(%)</h5>
                        <BarChar />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas Vendas</h5>
                        <DonutChar />
                    </div>

                </div>
                <div className="py-3">
                    <h2 className="text-primary">Todas As Vendas</h2>
                </div>


                <Datatable />
            </div>
            <Footer />
        </>
    );
}
export default Dashborad;