import {
  CART_ADD_ITEM_REQUEST,
  CART_ADD_ITEM_SUCCESS,
  CART_ADD_ITEM_FAIL,
  CART_ADD_ITEM_RESET,
  CART_REMOVE_ITEM_REQUEST,
  CART_REMOVE_ITEM_SUCCESS,
  CART_REMOVE_ITEM_FAIL,
  CART_REMOVE_ITEM_RESET,
  CART_SAVE_SHIPPING_ADDRESS,
  CART_SAVE_PAYMENT_METHOD,
  CART_CLEAR_ITEMS,
  CART_DETAILS_REQUEST,
  CART_DETAILS_SUCCESS,
  CART_DETAILS_FAIL,
  CART_DETAILS_RESET
} from '../constants/cartConstants';



export const cartDetailReducer = (state = { cart: {} }, action) => {
  switch (action.type) {
    case CART_DETAILS_REQUEST:
      return { ...state, loading: true };
    case CART_DETAILS_SUCCESS:
      return { loading: false, cart: action.payload };
    case CART_DETAILS_FAIL:
      return { loading: false, error: action.payload };
    case CART_DETAILS_RESET:
      return {};
    default:
      return state;
  }
};

export const cartAddReducer = (state = {}, action) => {
  switch (action.type) {
    case CART_ADD_ITEM_REQUEST:
      return { loading: true };
    case CART_ADD_ITEM_SUCCESS:
      return { loading: false, success: true };
    case CART_ADD_ITEM_FAIL:
      return { loading: false, error: action.payload };
    case CART_ADD_ITEM_RESET:
      return {};
    default:
      return state;
  }
};

export const cartRemoveReducer = (state = {}, action) => {
  switch (action.type) {
    case CART_REMOVE_ITEM_REQUEST:
      return { loading: true };
    case CART_REMOVE_ITEM_SUCCESS:
      return { loading: false, success: true };
    case CART_REMOVE_ITEM_FAIL:
      return { loading: false, error: action.payload };
    case CART_REMOVE_ITEM_RESET:
      return {};
    default:
      return state;
  }
};
